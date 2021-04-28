package in.design.pattern.creational.abstrac.factory.gcp;

import in.design.pattern.creational.abstrac.factory.Instance;
import in.design.pattern.creational.abstrac.factory.Instance.Capacity;
import in.design.pattern.creational.abstrac.factory.ResourceFactory;
import in.design.pattern.creational.abstrac.factory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
