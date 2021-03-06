package app.heroeswear.com.common;

import com.google.firebase.auth.FirebaseUser;

/**
 * Created by livnatavikasis on 01/05/2018.
 */

public interface FBCalbacks {
    void onCreateAccountCompleted(FirebaseUser user);
    void onCreateAccountFailed(String error);
    void onSignInCompleted(FirebaseUser user);
    void onSignInFailed(String error) ;
    void onSignOutCompleted();
}
