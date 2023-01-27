/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HER_A;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class ServiceController {
    private FormService formService;
    private ServiceDao serviceDao;
    private Service service;
    
    public ServiceController(FormService formService){
        this.formService = formService;
        serviceDao = new ServiceDaoImpl();
    }
    
    public void bersihForm(){
        formService.getTxtKode().setText("");
        formService.getTxtTgl().setText("");
        formService.getTxtPelanggan().setText("");
        formService.getTxtJenis().setText("");
        formService.getTxtBiaya().setText("");
        formService.getTxtDiskon().setText("");
    }
    
    public void getService(){
        int index = formService.getTblService().getSelectedRow();
        service = serviceDao.getService(index);
        formService.getTxtKode().setText(service.getKodetrans());
        if(service != null){
            List<Service> listService = serviceDao.getAll();
            formService.getTxtKode().setText(service.getKodetrans());
            formService.getTxtTgl().setText(service.getTgltrans());
            formService.getTxtPelanggan().setText(service.getPelanggan());
            formService.getTxtJenis().setText(service.getJenisservice());
            formService.getTxtBiaya().setText(service.getBiaya());
            formService.getTxtDiskon().setText(service.getDiskon());
        }
    }
    
    public void saveService(){
        service = new Service();
        service.setKodetrans(formService.getTxtKode().getText());
        service.setTgltrans(formService.getTxtTgl().getText());
        service.setPelanggan(formService.getTxtPelanggan().getText());
        service.setJenisservice(formService.getTxtJenis().getText());
        service.setBiaya(formService.getTxtBiaya().getText());
        service.setDiskon(formService.getTxtDiskon().getText());
        serviceDao.save(service);
        JOptionPane.showMessageDialog(formService, "Entri Data Ok!");
    }    
    
    public void deleteService(){
        int index = formService.getTblService().getSelectedRow();
        serviceDao.delete(index);
        javax.swing.JOptionPane.showMessageDialog(formService, "Delete Ok!");
    }
    
    public void UpdateService() {
        int index = formService.getTblService().getSelectedRow();
        service = serviceDao.getService(index);
        service.setKodetrans(formService.getTxtKode().getText());
        service.setTgltrans(formService.getTxtTgl().getText());
        service.setPelanggan(formService.getTxtPelanggan().getText());
        service.setJenisservice(formService.getTxtJenis().getText());
        service.setBiaya(formService.getTxtBiaya().getText());
        service.setDiskon(formService.getTxtDiskon().getText());
        serviceDao.update(index, service);
        javax.swing.JOptionPane.showMessageDialog(formService, "Update Ok!");
    }
    
    public void tampilData(){
        DefaultTableModel tabelModel = (DefaultTableModel) formService.getTblService().getModel();
        tabelModel.setRowCount(0);
        java.util.List<Service> listService = serviceDao.getAll();
        for(Service service : listService){
            Object[] data={
                service.getKodetrans(),
                service.getTgltrans(),
                service.getPelanggan(),
                service.getJenisservice(),
                service.getBiaya(),
                service.getDiskon(),
                
            };
            tabelModel.addRow(data);
        }
    }
}
