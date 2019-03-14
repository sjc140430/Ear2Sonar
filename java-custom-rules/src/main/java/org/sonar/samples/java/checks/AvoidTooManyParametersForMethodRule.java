package org.sonar.samples.java.checks;

import java.util.List;

import org.sonar.check.Rule;
import org.sonar.plugins.java.api.IssuableSubscriptionVisitor;
import org.sonar.plugins.java.api.semantic.Symbol.MethodSymbol;
import org.sonar.plugins.java.api.tree.MethodTree;
import org.sonar.plugins.java.api.tree.Tree;
import org.sonar.plugins.java.api.tree.Tree.Kind;

import com.google.common.collect.ImmutableList;

@Rule(key="AvoidTooManyParametersForMethod", 
	description = "Method shouldnt have more than 5 parameters", 
	name = "Return type and parameter of a method should not be the same",
	tags = {"bug"})
public class AvoidTooManyParametersForMethodRule extends IssuableSubscriptionVisitor{

	@Override
	public List<Kind> nodesToVisit() {
		// TODO Auto-generated method stub
		return ImmutableList.of(Tree.Kind.METHOD);
	}
	
	@Override
	public void visitNode(Tree tree) {
		MethodTree methodTree = (MethodTree) tree;
		
		MethodSymbol methodSymbol = methodTree.symbol();
		
		if(methodSymbol.parameterTypes().size() > 5) {
			reportIssue(tree, "Too Many Parameters");
		}
	}
	
}
