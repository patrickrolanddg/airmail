package airmail_client;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.seasar.extension.unit.S2TestCase;

import airmail_client.service.mail.MailSendServiceTest;

public class AllTest extends S2TestCase 
{
	public static Test suite()
	{
		TestSuite suite = new TestSuite();
		
		// TestCase追加
		suite.addTest(new TestSuite(MailSendServiceTest.class));
		
		return suite;
	}
}
