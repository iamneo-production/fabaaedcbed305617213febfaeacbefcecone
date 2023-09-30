@RestConroller
@RequestMapping("/medicines")
public class MedicineController {
    private static Map<Integer, Medicine> medicines = new Hashmap<>();
    @PostMapping
    public boolean addMedicine(@RequestBody Medicine medicine){
        if(medicines.containsKey(medicine.getMedicineId())){
            return false;
        }
        medicines.put(medicine.getMedicineId(),medicine);
        return true;
    }

    @putMapping("/{medicineId")
}
