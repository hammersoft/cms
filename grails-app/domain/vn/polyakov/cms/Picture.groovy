package vn.polyakov.cms

import org.apache.commons.codec.binary.Hex

import java.security.MessageDigest

class Picture {

    String fileName
    //String imageName
    Date creationDate = new Date()
    Date uploadDate = new Date()

    static mapping = {
        version false
        columns
                { id column:'fileName' }
    }

    static constraints = {
    }

    def saveImage(byte[] imageData) {
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(imageData)
        fileName = new String(Hex.encodeHex(md5.digest()));
        //TODO: Remove Hardcode!!!
        //File d = new File("/tmp/gallery/"+"/"+fileName);
        FileOutputStream fos = new FileOutputStream("/tmp/gallery/"+"/"+fileName);
        fos.write(imageData)
        fos.close();
    }

    def getImage() {
        //TODO: define config manager
        //TODO: Remove Hardcode!!!
        String dir = "/tmp/gallery/";
        File f = new File(dir+fileName);
        FileInputStream fis = new FileInputStream(f);

        long length = f.length()

        if (length > Integer.MAX_VALUE) {
            //logger.warning(filename + " file is too large!")
        }

        byte[] bytes = new byte[(int)length];

        int offset = 0;
        int numRead = 0;
        while (offset < bytes.length && (numRead=fis.read(bytes, offset, bytes.length-offset)) >= 0) {
            offset += numRead;
        }

        if (offset < bytes.length) {
            //log.error("Could not completely read file "+filename)
            //throw new IOException("Could not completely read file "+fileName.getName());
        }

        fis.close();
        return bytes;
    }

    private def createThumbnail() {
         //TODO: create small image from large
    }




}
