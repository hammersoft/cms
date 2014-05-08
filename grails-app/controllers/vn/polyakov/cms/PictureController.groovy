package vn.polyakov.cms

class PictureController {

    def image = {
          def img = Picture.findByFileName(params.id)
          response.contentType = "image/jpeg"
          response.outputStream << img.getImage()
          response.outputStream.flush()
          return;
    }

    def imgupload= {
        def f = request.getFile('image')
        def okcontents = [ 'image/jpeg' ]

        if (!okcontents.contains(f.getContentType())) {
            flash.message = "Image must be one of: ${okcontents}"
            render(view:'upload')
            return;
        }

        // Save the image and mime type
        Picture picture = new Picture()
        picture.saveImage(f.getBytes())
        //log.info("File uploaded: " + picture.imagename)

        if (!picture.save()) {
            flash.message = picture.errors.toString();
            params.id = picture.fileName;
            render(view:'upload',params:params);
            return;
        }

        flash.message = "Image (${picture.fileName}) uploaded."
        params.id = picture.fileName;
        redirect(action:'image',params:params)

    }

    def upload = {
        render(view:'upload')
    }
}
