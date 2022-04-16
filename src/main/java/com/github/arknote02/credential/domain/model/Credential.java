package com.github.arknote02.credential.domain.model;

import lombok.NonNull;

public record Credential(@NonNull LoginId loginId, @NonNull Password password) {

}
