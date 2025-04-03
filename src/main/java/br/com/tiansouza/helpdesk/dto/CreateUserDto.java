package br.com.tiansouza.helpdesk.dto;

public record CreateUserDto(
        String username,
        String email,
        String password,
        String name,
        Boolean active
) {
}
