package com.hroscope.cegep.cegephoroscope;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.facebook.CallbackManager;
import com.facebook.login.widget.LoginButton;
import com.google.firebase.auth.FirebaseAuth;
import com.hroscope.cegep.cegephoroscope.Email_SignIn.Email_Sigin_Fragment;
import com.hroscope.cegep.cegephoroscope.Facebook_SignIn.FacebookFragment;
import com.hroscope.cegep.cegephoroscope.Facebook_SignIn.Fb_Profile_Fragment;
import com.hroscope.cegep.cegephoroscope.Phone_SignIn.PhoneLoginFragment;


/**
 * A simple {@link Fragment} subclass.
 */
public class SignupFragment extends Fragment implements View.OnClickListener{
    private View view;
    private Button email_login_button, phone_login_Button;
    public Button facebook_login_button;
    private Button google_login_button;
    public LoginButton facebook_login;
    private TextView register;

    //Facebook Widgets
    LoginButton loginButton;
    TextView textView;
    private CallbackManager callbackManager;
    private FirebaseAuth firebaseAuth;
    String Birthday;
    boolean clicked=false;
    private FirebaseAuth.AuthStateListener firebaseauthlistener;
    Fb_Profile_Fragment fba=new Fb_Profile_Fragment();
    public static int buttonNumber;



    public static SignupFragment newInstance() {
        SignupFragment fragment = new SignupFragment();
        return fragment;
    }
    public SignupFragment() {


    }

    public void initializeButtons()
    {
       facebook_login=(LoginButton)view.findViewById(R.id.facebook_login);
        facebook_login_button =(Button) view.findViewById(R.id.facebook_button);


        email_login_button =(Button)view.findViewById(R.id.email);
        phone_login_Button =(Button)view.findViewById(R.id.phoneNumber);
        register=(TextView)view.findViewById(R.id.register);

        facebook_login_button.setOnClickListener(this);

        email_login_button.setOnClickListener(this);
        phone_login_Button.setOnClickListener(this);
        register.setOnClickListener(this);

    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       view= inflater.inflate(R.layout.fragment_signup, container, false);

        initializeButtons();

        return view;
    }

    @Override
    public void onClick(View view) {
        if(view== facebook_login_button)
        {
            buttonNumber =1;
           Fragment fragment = new FacebookFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();

         //  startActivity(new Intent(getActivity(), FacebookFragment.class));

        }
      /*  if(view== google_login_button)
        {
            buttonNumber =2;
            Fragment fragment = new GoogleFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
        }*/
        if(view== email_login_button)
        {
            buttonNumber =2;
            Fragment fragment = new Email_Sigin_Fragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();

        }
        if(view== phone_login_Button)
        {
            buttonNumber =3;

            Fragment fragment = new PhoneLoginFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();

        }
        if(view==register)
        {

            Fragment fragment = new RegisterFragment();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().replace(R.id.frame_layout, fragment).commit();
        }


    }

    public int buttonClicked()
    {
        return buttonNumber;
    }
}
