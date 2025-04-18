package org.example.expert.domain.user.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserChangePasswordRequest {

    @NotBlank
    private String oldPassword;

    @NotBlank
    @Size(min = 8, message = "새 비밀번호는 최소 8자 이상이어야 합니다.")
    @Pattern(regexp = ".*\\d.*", message = "새 비밀번호에는 숫자가 하나 이상 포함되어야 합니다.")
    @Pattern(regexp = ".*[A-Z].*", message = "새 비밀번호에는 대문자가 하나 이상 포함되어야 합니다.")
    private String newPassword;
}
