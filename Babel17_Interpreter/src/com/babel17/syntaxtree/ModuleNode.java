package com.babel17.syntaxtree;

public class ModuleNode extends Node {
    
    private ModuleIdNode moduleId;
    private BlockNode block;

    public ModuleNode(ModuleIdNode moduleId, BlockNode block) {
        this.moduleId = moduleId;
        this.block = block;
    }

    public BlockNode block() {
        return block;
    }

    public ModuleIdNode moduleId() {
        return moduleId;
    }

    public NodeList children() {
        return new NodeList().cons(block).cons(moduleId);
    }

}
