package in.design.pattern.creational.abstrac.factory;

//Abstract factory with methods defined for each object type.
public interface ResourceFactory {

	Instance createInstance(Instance.Capacity capacity);
	
	Storage createStorage(int capMib);
}
