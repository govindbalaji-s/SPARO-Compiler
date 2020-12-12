package sparo;

class Semantic {
  private boolean errorFlag = false;

  public boolean getErrorFlag() {
    return errorFlag;
  }

  public Semantic(SparoParser.ProgramContext prgctx) {
    printAllClasses(prgctx.class_definition_list());
  }

  public void printAllClasses(SparoParser.Class_definition_listContext ctx) {
    if(ctx == null)
      return;

    System.out.println(ctx.class_definition().class_head().TYPEID());
    printAllClasses(ctx.class_definition_list());
  }

  public void print(){
    System.out.println("Hello");
  }
}
