class BootStrap {

    def init = { servletContext ->
        //TODO Remove hardcode!!!
        File f = new File("/tmp/gallery/");
        if (!f.exists()) {
            f.mkdirs();
        }
    }
    def destroy = {
    }
}
