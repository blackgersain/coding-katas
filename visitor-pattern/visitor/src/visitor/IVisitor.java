package visitor;

public interface IVisitor {
	
	void visit(ILightUnit unit);
	
	void visit(IArmoredUnit unit);
}
