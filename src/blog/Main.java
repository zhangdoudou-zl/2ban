package blog;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<String> featureList = new ArrayList<>();
    private static List<Action> actionList = new ArrayList<>();

    private static void initFeatureList() {
        featureList.add("用户注册");
        featureList.add("用户登录");
        featureList.add("查看文章列表-按照发表时间倒序给出");
        featureList.add("发表文章-要求先登录");
        featureList.add("查看指定文章内容");
        featureList.add("评论指定文章-要求先登录");
        featureList.add("点赞指定文章-要求先登录");
    }

    private static void initActionList() {
        actionList.add(new UserRegisterAction());
        actionList.add(new UserLoginAction());
        actionList.add(new ArticleListAction());
        actionList.add(new ArticlePublishAction());
        actionList.add(new ArticleDetailAction());
    }

    public static void main(String[] args) {
        initFeatureList();
        initActionList();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMenu();
            showPrompt();
            int select = scanner.nextInt();
            // 分发
            doAction(select);
        }
    }

    private static void doAction(int select) {
        if (select == 0) {
            System.out.println("欢迎下次再来!");
            System.exit(0);
        }

        System.out.println("您的选择是: " + featureList.get(select - 1));
        if (select - 1 < actionList.size()) {
            Action action = actionList.get(select - 1);
            action.run();
        } else {
            System.out.println("该功能尚未支持，敬请期待...");
        }
    }

    private static void showPrompt() {
        System.out.print("请输入功能的序号> ");
    }

    private static void showMenu() {
        System.out.println("欢迎使用《博客系统》，支持以下功能");
        for (int i = 0; i < featureList.size(); i++) {
            System.out.printf("  %d. %s%n", i + 1, featureList.get(i));
        }
        System.out.println("  0. 退出");
    }
}
