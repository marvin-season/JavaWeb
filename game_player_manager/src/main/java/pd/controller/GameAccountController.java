package pd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import pd.domain.GameAccount;
import pd.service.IGameAccountService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("gameAccount")
@SessionAttributes(value = "delete_success")
public class GameAccountController {
    @Autowired
    @Qualifier("gameAccountService")
    private IGameAccountService gameAccountService = null;

    @RequestMapping("findAll")
    public String findAll(Model model) {
        List<GameAccount> gameAccounts = gameAccountService.findAll();
        model.addAttribute("gameAccounts", gameAccounts);
        return "gameAccountsInfo";
    }

    //跳转到登录页面
    @RequestMapping("gotoLogin")
    public String gotoLogin(HttpServletRequest httpServletRequest) {
        return "redirect: " + httpServletRequest.getContextPath() + "/loginGA.jsp";
    }

    //    登录游戏账号
    @RequestMapping("login")
    public String login(GameAccount gameAccount, Model model, HttpServletRequest httpServletRequest) {
        List<GameAccount> results = gameAccountService.findForLogin(gameAccount);
        System.out.println(results);
        if (results.size() == 0) {
            return "redirect: " + httpServletRequest.getContextPath() + "/registerGA.jsp";//登陆失败,跳转注册页面
        }
        model.addAttribute("results", results);
        return "success";
    }

    @RequestMapping("gotoRegisterP")
    public String gotoRegister(HttpServletRequest httpServletRequest) {
        return "redirect: " + httpServletRequest.getContextPath() + "/registerP.jsp";
    }

    @RequestMapping("gotoRegisterGA")
    public String gotoRegisterGA(HttpServletRequest httpServletRequest){
        return "redirect: " + httpServletRequest.getContextPath() + "/registerGA.jsp";
    }
    //注册游戏账号
    @RequestMapping("registerGA")
    public String registerAccount(GameAccount gameAccount, HttpServletRequest httpServletRequest) {
        int i = gameAccountService.saveGameAccount(gameAccount);
        if (i == 0) {
            return "redirect: " + httpServletRequest.getContextPath() + "/registerGA.jsp";
        }
        return "redirect: " + httpServletRequest.getContextPath() + "/loginGA.jsp";
    }


    //    跳转到查询游戏账号及其玩家信息页面
    @RequestMapping("gotoFindAGameAccountWithPlayer")
    public String gotoFindGameAccountWithPlayer(HttpServletRequest httpServletRequest) {
        System.out.println(httpServletRequest.getContextPath());

        //转发到查询页面
        return "redirect:  " + httpServletRequest.getContextPath() + "/findAGameAccountWithPlayer.jsp";
    }

    //    查询游戏账号及其玩家信息
    @RequestMapping("findAGameAccountWithPlayer")
    public String findGameAccountWithPlayer(GameAccount gameAccount, Model model) {
        List<GameAccount> gameAccountWithPlayers = gameAccountService.findAGameAccountWithPlayer(gameAccount);
        if (gameAccountWithPlayers.size() == 0) {
            return "noInfo";
        }
        model.addAttribute("AGameAccountWithPlayers", gameAccountWithPlayers);
        return "displayAGameAccountWithPlayers";
    }

    /**
     * @return
     */
    @RequestMapping("gotoDeleteGAInfo")
    public String gotoDeleteGAInfo(HttpServletRequest httpServletRequest) {
        return "redirect:  " + httpServletRequest.getContextPath() + "/deleteGAInfo.jsp";
    }

    @RequestMapping("deleteGAInfo")
    public String deleteGAInfo(Model model, GameAccount gameAccount, HttpServletRequest httpServletRequest) {
        List<GameAccount> results = gameAccountService.findForLogin(gameAccount);
        if (results.size() == 0) {
            model.addAttribute("delete_success", false);
            return "redirect:  " + httpServletRequest.getContextPath() + "/deleteGAInfo.jsp";//注册失败
        }
        gameAccountService.deleteGAInfoByName(gameAccount);
        model.addAttribute("delete_success", true);
        return "deleteSuccess";
    }
}
