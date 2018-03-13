package switches;

import static switches.state.*;

enum state { on, off }

public class Switch {

	private state _state;

	// Constructor - used to initialize new objects.
	public Switch(state state) {
		_state = state;
	}

	// Getters
	public state getState() { return _state; }

	public boolean isOn() { return (getState() == on) ? true : false; }

	// Setters
	public void setState(state state) {
		_state = state;
	}

	public void on() { setState(on); }
	public void off() { setState(off); }
	public void toggle() {
		if (isOn())
			off();
		else
			on();
	}
}
