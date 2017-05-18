package com.example.promptnow003.mvpstructure.login;

/**
 * Created by PromptNow003 on 18/5/2560.
 */

public class LoginPresenter implements LoginInterface.Presenter {

    LoginInterface.View view;

    public LoginPresenter(LoginInterface.View view) {
        this.view = view;
    }

    @Override
    public void onLoginButtonClick(String user, String pass) {
        view.showLoginMessage("user : "+user+" pass : "+pass);
        view.goSecondActivity(user,pass);
    }
}
