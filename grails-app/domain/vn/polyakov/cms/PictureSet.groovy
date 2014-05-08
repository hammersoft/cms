package vn.polyakov.cms

class PictureSet {

    String name
    Date creationDate = new Date()
    Date updateDate = new Date()

    static hasMany = [pictures:Picture]


    static constraints = {
    }
}
