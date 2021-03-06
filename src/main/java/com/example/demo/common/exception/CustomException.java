package com.example.demo.common.exception;

import lombok.*;

import java.io.Serializable;

@Builder
@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class CustomException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -7017411287972434840L;

    private String code;
    private String msg;
}

