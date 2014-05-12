package vn.polyakov.cms

class PictureSetController {

    def index() {
        redirect(action: "list")
    }

    def list() {
        [pictureSetList: PictureSet.list()]
    }

    def create() {
        render(view:'create')
    }

    def ccreate() {
        PictureSet pictureSet = new PictureSet();
        pictureSet.name = params.name
        pictureSet.save()
        redirect(action:'view',params:[id:pictureSet.id])
    }

    def delete() {
        //TODO: render delete PictureSet view
    }

    def cdelete() {
        PictureSet.findById(params.id).delete()
    }

    def edit() {
            [pictureSet:PictureSet.get(params.id), pictures:Picture.listOrderByUploadDate(order: "desc")]
    }

    def cedit() {
        PictureSet pictureSet= PictureSet.get(params.id)
        pictureSet.pictures=Picture.findAllByFileNameInList(params.pid.toList())
        pictureSet.save()
        redirect(action: "view",id:params.id)

        //TODO: edit Picture into PictureSet  view (id,pid)
    }

    def remove() {
        //TODO: remove Picture from PictureSet (id,pid)
    }

    def view() {
        [pictureSet:PictureSet.findById(params.id)]
    }

}
