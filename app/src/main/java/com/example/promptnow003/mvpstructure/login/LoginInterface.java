package com.example.promptnow003.mvpstructure.login;

/**
 * Created by PromptNow003 on 18/5/2560.
 */

public interface LoginInterface {

    interface View {

        void showLoginMessage(String text);

        void goSecondActivity(String user,String pass);
    }

    interface Presenter {
        void onLoginButtonClick(String user,String pass);
    }
}
