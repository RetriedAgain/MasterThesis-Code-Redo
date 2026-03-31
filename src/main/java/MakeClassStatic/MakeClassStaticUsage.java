package MakeClassStatic;

public class MakeClassStaticUsage {
	MakeClassStatic m_outside = new MakeClassStatic();
	MakeClassStatic.A a_outside = m_outside.new A(m_outside);
}
