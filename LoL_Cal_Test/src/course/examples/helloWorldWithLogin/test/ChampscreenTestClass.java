package course.examples.helloWorldWithLogin.test;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import com.example.lol_cal.*;

public class ChampscreenTestClass extends ActivityInstrumentationTestCase2<Champscreen> {
	private Solo solo;

	public ChampscreenTestClass() {
		super(Champscreen.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	public void testNoInputLogin() throws Exception {
		solo.assertCurrentActivity("wrong activity", Champscreen.class);
		solo.clickOnButton("Login");
		assertFalse(solo.waitForText("Hello Android"));
	}
	
	
}
