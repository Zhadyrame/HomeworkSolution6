package scr;

public class FAQBotHandler extends SupportHandler {
    @Override
    public void handle(String issue) {
        if (issue.equals("PasswordReset")) {
            System.out.println("[FAQBot] Handled " + issue);
        } else if (next != null) {
            System.out.println("[FAQBot] Passing to next handler...");
            next.handle(issue);
        }
    }
}
