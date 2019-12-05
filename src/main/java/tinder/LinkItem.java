package tinder;

public class LinkItem {

        private final String href;
        private final String name;

        public LinkItem(String href, String name) {
            this.href = href;
            this.name = name;
        }

        public String getHref() {
            return this.href;
        }

        public String getName() {
            return this.name;
        }

}
