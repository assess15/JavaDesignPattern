package com.laychv.design.creational.BuilderPattern.android;

/**
 * 模拟Android源码中AlertDialog使用构建者模式
 */
public class AlertDialog {

    public String icon;
    public String title;
    public String message;

    public AlertDialog(Builder builder) {
        this.icon = builder.icon;
        this.title = builder.title;
        this.message = builder.message;
    }

    public static void main(String[] args) {
        AlertDialog dialog = new AlertDialog.Builder("context")
                .setTitle("title")
                .setIcon("icon")
                .setMessage("message")
                .show();
        System.out.println(dialog);

        AlertDialog.Builder b = new AlertDialog.Builder("this");
        b.setIcon("icon");
        b.setTitle("title");
        b.setMessage("message");
        b.show();
        System.out.println(b);
    }

    public static class Builder {

        private String icon;
        private String title;
        private String message;

        public Builder(String context) {
            System.out.println(context);
        }

        public Builder setIcon(String icon) {
            this.icon = icon;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setMessage(String message) {
            this.message = message;
            return this;
        }

        public AlertDialog show() {
            return new AlertDialog(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "icon='" + icon + '\'' +
                    ", title='" + title + '\'' +
                    ", message='" + message + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "AlertDialog{" +
                "icon='" + icon + '\'' +
                ", title='" + title + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
