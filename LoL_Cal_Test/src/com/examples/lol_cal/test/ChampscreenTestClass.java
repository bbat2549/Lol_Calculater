package com.examples.lol_cal.test;

import com.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;
import com.example.lol_cal.*;
public class ChampscreenTestClass extends ActivityInstrumentationTestCase2<Startscreen> {
	private Solo solo;

	public ChampscreenTestClass() {
		super(Startscreen.class);
	}

	public void setUp() throws Exception {
		solo = new Solo(getInstrumentation(), getActivity());
	}

	@Override
	public void tearDown() throws Exception {
		solo.finishOpenedActivities();
	}

	public void testChampPress() throws Exception {
		solo.assertCurrentActivity("wrong activity", Startscreen.class);
		solo.clickOnButton(0);
		solo.clickOnButton(0);
		assertTrue(solo.waitForText("Karma"));
	}
	
	public void testItemPress() throws Exception {
		solo.assertCurrentActivity("wrong activity", Startscreen.class);
		solo.clickOnButton(0);
		solo.clickOnButton(0);
		solo.clickOnButton(0);
		assertTrue(solo.waitForText("Attack Dam: 57.0"));
	}
	
	public void testDifferentChampion() throws Exception {
		solo.assertCurrentActivity("wrong activity", Startscreen.class);
		solo.clickOnButton(0);
		solo.clickOnButton(1);
		assertFalse(solo.waitForText("Karma"));
	}
	
}
