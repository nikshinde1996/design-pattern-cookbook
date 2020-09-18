package classs.adaptor;

public interface IntegerValueInterface {
	public int getInteger();
}

class IntegerValue implements IntegerValueInterface {

	@Override
	public int getInteger() {
		return 5;
	}
}

// Uses inheritance for adaptor implementation
class ClassAdaptor extends IntegerValue {
	
	@Override
	public int getInteger() {
		return 2 + super.getInteger();
	}
}

//Uses composition for adaptor implementation
class ObjectAdaptor {
	private IntegerValueInterface ivInterface;
	
	public ObjectAdaptor(IntegerValueInterface ivInterface) {
		this.ivInterface = ivInterface;
	}
	
	public int getInteger() {
		return this.ivInterface.getInteger();
	}
}