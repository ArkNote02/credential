package com.github.arknote02.credential.domain.port;

import com.github.arknote02.credential.domain.model.AccessToken;
import com.github.arknote02.credential.domain.model.LoginId;

public interface AccessTokenNotifier {

  void notice(LoginId loginId, AccessToken accessToken);
}
