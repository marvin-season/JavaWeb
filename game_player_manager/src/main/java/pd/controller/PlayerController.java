package pd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pd.domain.Player;
import pd.service.IPlayerService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("player")
public class PlayerController {
    @Autowired
    @Qualifier("playerService")
    private IPlayerService playerService = null;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<Player> players = playerService.findAll();
        model.addAttribute("players", players);
        return "playersInfo";
    }

    @RequestMapping("registerPlayer")
    public String registerPlayer(Player player) {
        int i = playerService.savePlayer(player);
        if (i == 0) {
            return "registerFailure";
        }
        return "registerSuccess";
    }

    //    跳转到查询页面
    @RequestMapping("gotoFindAPlayerWithGameAccount")
    public String gotoFindAPlayerWithGameAccount(HttpServletRequest httpServletRequest) {
        return "redirect:  " + httpServletRequest.getContextPath() + "/findAPlayerWithGameAccount.jsp";
    }
//多表查询
    @RequestMapping("findAPlayerWithGameAccount")
    public String findAPlayerWithGameAccount(String name, Model model) {
        List<Player> playerWithGameAccounts = playerService.findAPlayerWithGameAccount(name);
        List<Player> allRolersOfPlayer = playerService.findAllRolersOfPlayer(name);
        if (playerWithGameAccounts.size() == 0 || allRolersOfPlayer.size() == 0) {
            return "noInfo";
        }
        model.addAttribute("playerWithGameAccounts", playerWithGameAccounts);
        model.addAttribute("allRolersOfPlayer", allRolersOfPlayer);
        return "displayAPlayerWithGameAccounts";
    }

    //    跳转到修改玩家信息页面
    @RequestMapping("gotoModifyPlayerInfo")
    public String gotoModifyPlayerInfo(HttpServletRequest httpServletRequest) {
        return "redirect:  " + httpServletRequest.getContextPath() + "/updatePlayerInfo.jsp";
    }

    //    修改玩家信息页面
    @RequestMapping("modifyPlayerInfo")
    public String modifyPlayerInfo(Model model, Player player, HttpServletRequest httpServletRequest) {
        int i = playerService.modifyPlayerInfo(player);
        if (i != 1) {
            return "redirect:  " + httpServletRequest.getContextPath() + "/updatePlayerInfo.jsp";
        }
        return "updateSuccess";
    }
}
