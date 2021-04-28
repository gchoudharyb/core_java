package in.design.pattern.creational.abstrac.factory.aws;

import in.design.pattern.creational.abstrac.factory.Instance;
import in.design.pattern.creational.abstrac.factory.Instance.Capacity;
import in.design.pattern.creational.abstrac.factory.ResourceFactory;
import in.design.pattern.creational.abstrac.factory.Storage;
//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
