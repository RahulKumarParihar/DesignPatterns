package com.rahulkumarpariharmailbox.Creational.FactoryPattern;

public class TraversalFactory {
    public static GraphTraversal objectOfGraphTraversal(Traversal enumValue) {
        switch (enumValue) {
            case InOrderTraversal:
                return new InOrderTraversal();
            case PreOrderTraversal:
                return new PreOrderTraversal();
            case PostOrderTraversal:
                return new PostOrderTraversal();
            case LevelOrderTraversal:
                return new LevelOrderTraversal();
            default:
                return tree -> {
                    throw new IllegalStateException("Unexpected value: " + enumValue);
                };
        }
    }
}
