package pers.pudge.spark.java.po;

public class ExcelFieldPo {

    private String name;

    private String comment;

    private String type;

    public ExcelFieldPo(String name, String comment, String type) {
        this.name = name;
        this.comment = comment;
        this.type = type;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
