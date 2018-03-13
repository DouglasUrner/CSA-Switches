package switches;

import static switches.state.*;

enum state { on, off }

public class Switch {

	/*
	 * Object fields
	 *
	 * The object fields hold the state of the object - whether the
	 * switch is on or off (open or closed), and a label that can be
	 * used to describe the switch.
	 */
	private String _label;
	private state _state;

	/*
	 * Constructors
	 *
	 * Constructors allocate storage for the object and initialize its
	 * fields. A common practice is to have one "master" constructor
	 * that initializes all of the settable fields. It may also compute
	 * values for fields that are not set directly and which need to get
	 * initial values.
	 */
	public Switch(String label, state state) {
		_label = label;
		_state = state;
	}

	/*
	 * Convenience constructors - shorthand versions that supply reasonable
	 * default values. Each must have a unique signature (list of parameters).
	 */
	public Switch(String label) {
		this(label, off);
	}

	public Switch() {
		this("", off);
	}

	/*
	 * Instance Methods
	 *
	 * These methods define the public "face" of the object - the way the
	 * object interacts with its clients. Notice that instance methods are
	 * not declared as static.
	 */

	/*
	 * Accessors (aka getters) provide controlled access to the object's state.
	 */
	public String getLabel() { return _label; }

	public state getState() { return _state; }

	public boolean isOn() { return (getState() == on); }

	/*
	 * Mutators (aka setters) mediate requests to change the object's state.
	 */
	public void setLabel(String label) { _label = label; }

	public void setState(state state) {	_state = state;	}

	public void on() { setState(on); }

	public void off() { setState(off); }

	public void toggle() {
		if (isOn())
			off();
		else
			on();
	}

	/*
	 * Provide a toSting() method so that the object can be printed in
	 * a useful form for testing, debugging, and in error messages.
	 */
	@Override
	public String toString() {
		return getLabel() + ": " + getState();
	}
}
