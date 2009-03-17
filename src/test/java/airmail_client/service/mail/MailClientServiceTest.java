package airmail_client.service.mail;

import org.seasar.extension.unit.S2TestCase;

public class MailClientServiceTest extends S2TestCase 
{
	public MailClientService service;
	

	@Override
	protected void setUp() throws Exception 
	{
		super.setUp();
		include("app.dicon");
	}
	
	@Override
	protected void tearDown() throws Exception 
	{
		super.tearDown();
	}
	
	public void testSend() throws Exception
	{
		service.send();
	}
}
