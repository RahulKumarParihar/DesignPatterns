package com.rahulkumarpariharmailbox.Creational.Builder;

public class LunchOrderBean {
    private final String bread;
    private final String condiments;
    private final String dressing;
    private final String meat;

    public LunchOrderBean(Builder builder) {
        this.bread = builder.bread;
        this.condiments = builder.condiments;
        this.dressing = builder.dressing;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }

    public static class Builder {
        // Since builder is its own container
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        /**
         * Added properties as arguments which you think are must to have.
         */
        public Builder() {

        }

        public LunchOrderBean build() {
            return new LunchOrderBean(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder condiments(String condiments) {
            this.condiments = condiments;
            return this;
        }

        public Builder dressing(String dressing) {
            this.dressing = dressing;
            return this;
        }

        public Builder meat(String meat) {
            this.meat = meat;
            return this;
        }
    }
}
