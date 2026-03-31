package MakeClassStatic;

public class MakeClassStaticUsage {
	MakeClassStatic m_outside = new MakeClassStatic();
	MakeClassStatic.A a_outside = new MakeClassStatic.A(m_outside, m_outside);
}
