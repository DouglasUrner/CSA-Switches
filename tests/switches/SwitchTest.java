package switches;

import org.junit.Test;

import static switches.state.*;

import static org.junit.Assert.*;

public class SwitchTest {

	@Test
	public void SwitchTest_getState() {
		Switch s = new Switch("", off);
		assertTrue(s.getState() == off);
	}

	@Test
	public void SwitchTest_isOn() {
		Switch s = new Switch("", off);
		assertFalse(s.isOn());
		s.on();
		assertTrue(s.isOn());
	}

	@Test
	public void SwitchTest_setState() {
		Switch s = new Switch("", off);
		s.setState(on);
		assertTrue(s.getState() == on);
		s.setState(off);
		assertTrue(s.getState() == off);
	}

	@Test
	public void SwitchTest_on() {
		Switch s = new Switch("", off);
		s.on();
		assertTrue(s.getState() == on);
	}

	@Test
	public void SwitchTest_off() {
		Switch s = new Switch("", off);
		s.setState(on);
		assertTrue(s.getState() == on);
		s.off();
		assertTrue(s.getState() == off);
	}

	@Test
	public void SwitchTest_toggle() {
		Switch s = new Switch("", off);
		s.toggle();
		assertTrue(s.getState() == on);
		s.toggle();
		assertTrue(s.getState() == off);
	}

	@Test
	public void SwitchTest_getLabel() {
		Switch s = new Switch("Master", off);
		assertEquals("Master", s.getLabel());
	}

	@Test
	public void SwitchTest_setLabel() {
		Switch s = new Switch("", off);
		s.setLabel("Master");
		assertEquals("Master", s.getLabel());
	}

	@Test
	public void SwitchTest_toString1() {
		Switch s = new Switch();
		assertEquals("(unlabeled): off", s.toString());
	}

	@Test
	public void SwitchTest_toString2() {
		Switch s = new Switch("Master", off);
		assertEquals("Master: off", s.toString());
	}
}