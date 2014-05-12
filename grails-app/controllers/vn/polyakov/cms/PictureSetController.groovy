package vn.polyakov.cms

class PictureSetController {

    def index() {}

    def list() {
        [pictureSetList: PictureSet.findAll()]
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

    def append() {
        render(view:'append')
    }

    def cappend() {
        //TODO: append Picture into PictureSet  view (id,pid)
    }

    def remove() {
        //TODO: remove Picture from PictureSet (id,pid)
    }

    def view() {
        [pictureSet:PictureSet.findById(params.id)]
    }

}
