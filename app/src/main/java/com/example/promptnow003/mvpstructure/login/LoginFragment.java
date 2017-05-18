package com.example.promptnow003.mvpstructure.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.promptnow003.mvpstructure.R;
import com.example.promptnow003.mvpstructure.main.FirstActivity;


/**
 * Created by Prew.
 */
@SuppressWarnings("unused")
public class LoginFragment extends Fragment implements LoginInterface.View {

    EditText edtUser, edtPass;
    Button btnLogin;
    LoginInterface.Presenter presenter;

    public LoginFragment() {
        super();
    }

    @SuppressWarnings("unused")
    public static LoginFragment newInstance() {
        LoginFragment loginFragment = new LoginFragment();
        Bundle args = new Bundle();
        loginFragment.setArguments(args);
        return loginFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init(savedInstanceState);

        if (savedInstanceState != null)
            onRestoreInstanceState(savedInstanceState);
    }

    @Override
    public android.view.View onCreateView(LayoutInflater inflater, ViewGroup container,
                                          Bundle savedInstanceState) {
        android.view.View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        initInstances(rootView, savedInstanceState);
        return rootView;
    }

    private void init(Bundle savedInstanceState) {
        // Init LoginFragment level's variable(s) here
    }

    @SuppressWarnings("UnusedParameters")
    private void initInstances(android.view.View rootView, Bundle savedInstanceState) {
        // Init 'View' instance(s) with rootView.findViewById here
        edtUser = (EditText) rootView.findViewById(R.id.edt_login_user);
        edtPass = (EditText) rootView.findViewById(R.id.edt_login_pass);
        btnLogin = (Button) rootView.findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.onLoginButtonClick(
                        edtUser.getText().toString(), edtPass.getText().toString()
                );
            }
        });

        presenter = new LoginPresenter(this);
    }

    @Override
    public void onStart() {
        super.onStart();
    }

    @Override
    public void onStop() {
        super.onStop();
    }

    /*
     * Save Instance State Here
     */
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        // Save Instance State here
    }

    /*
     * Restore Instance State Here
     */
    @SuppressWarnings("UnusedParameters")
    private void onRestoreInstanceState(Bundle savedInstanceState) {
        // Restore Instance State here
    }

    @Override
    public void showLoginMessage(String text) {
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void goSecondActivity(String user, String pass) {
        if (user.equals("admin") && pass.equals("1234")) {
            Intent intent = new Intent(getContext(), FirstActivity.class);
            startActivity(intent);
        }
    }
}
