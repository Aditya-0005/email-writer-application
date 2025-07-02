package com.email_writer_sb.email_writer_application;

import lombok.Data;

@Data
public class EmailRequest {
    private String emailContent;
    private String tone;
}
