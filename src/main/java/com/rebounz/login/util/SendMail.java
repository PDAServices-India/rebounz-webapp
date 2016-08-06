package com.rebounz.login.util;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.Message.RecipientType;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.rebounz.login.service.impl.UserServiceImpl;


/**
 * For Sending Mail.
 * 
 * @author Manojsundar.G
 *
 */
public class SendMail {

	private String from;
	private String to;
	private String subject;
	private String text;

	/** used for Logging. */
	private static final Log LOGGER = LogFactory.getLog(SendMail.class);

	public SendMail(String from, String to, String subject, String text) {
		this.from = from;
		this.to = to;
		this.subject = subject;
		this.text = text;
	}

	public void send() {
		Properties props = new Properties();
		props.put("mail.smtp.host", "mail.smtp.in");
		props.put("mail.smtp.port", "2525");
		Session mailSession = Session.getDefaultInstance(props);
		Message simpleMessage = new MimeMessage(mailSession);
		InternetAddress fromAddress = null;
		InternetAddress toAddress = null;
		try {
			fromAddress = new InternetAddress(from);
			toAddress = new InternetAddress(to);
			simpleMessage.setFrom(fromAddress);
			simpleMessage.setRecipient(RecipientType.TO, toAddress);
			simpleMessage.setSubject(subject);
			simpleMessage.setText(text);
			Transport.send(simpleMessage);
		} catch (MessagingException e) {
			LOGGER.error(e.getMessage(), e);
		}
	}
}
