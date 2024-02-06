class Badge {
    public String print(Integer id, String name, String department) {
        String res = "";
        if (id == null && department == null){
            res = name + " - OWNER";
        } else if (department == null) {
            res = "["+id+"] - "+name+" - OWNER";
        }else if (id == null) {
            res = name+" - "+department.toUpperCase();
        }else {res = "["+id+"] - "+name+" - "+department.toUpperCase();}
        return res ;
    }
}
