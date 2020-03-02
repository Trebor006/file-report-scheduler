package com.mibu.finder.user.rule.executor.mailsender;

import com.mibu.finder.user.rule.executor.generator.mail.factory.method.Mail;

public interface MailSender {
   void sendMail(Mail mail);
}
