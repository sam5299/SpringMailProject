package com.test.testing.SendEmail;

import org.apache.juli.logging.Log;
import org.apache.juli.logging.LogFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SmtpMail implements MailSender {

	Log l=LogFactory.getLog(SmtpMail.class);
	@Override
	public void sendMail(String to, String sub, String message) {
		// TODO Auto-generated method stub

		l.info("Mail is sent to:"+to);
		l.info("Mail Subject:"+sub);
		l.info("Message:"+message);
		l.warn("Mail send through Smtpmail class");
	}

}
