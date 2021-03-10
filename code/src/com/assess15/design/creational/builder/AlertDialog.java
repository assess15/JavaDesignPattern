package com.assess15.design.creational.builder;

public class AlertDialog {

    public static void main(String[] args) {
        AlertDialog dialog = new AlertDialog.Builder("context")
                .setTitle("title")
                .setIcon("icon")
                .setMessage("message")
                .show();

        // 模仿dialog
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
            return new AlertDialog();
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
}
