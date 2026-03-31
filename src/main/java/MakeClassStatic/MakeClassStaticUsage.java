package MakeClassStatic;

public class MakeClassStaticUsage {
	MakeClassStatic m_outside = new MakeClassStatic();
	// Uncomment this when selecting "Yes" to replace instance qualifiers with class references. Otherwise causes error.
		MakeClassStatic.A a_outside = new MakeClassStatic.A();
}
