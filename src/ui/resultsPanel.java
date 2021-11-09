/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.*;
import java.util.HashMap;
import javax.swing.JOptionPane;
/**
 *
 * @author shreyasprasad
 */
public class resultsPanel extends javax.swing.JPanel {

    private PatientDirectory patientDirectory;
    private ArrayList<Community> commList = new ArrayList<>();
    private Community community;
    
    private HashMap<String, Integer> comHashMap = new HashMap<>();
      
    
    /**
     * Creates new form resultsPanel
     */
    public resultsPanel(PatientDirectory patientDirectory) {
        this.patientDirectory = patientDirectory;
        initComponents();
        populatePatientsTable();
        
    }
    
    
    public boolean ifAbnormal(int age, Encounter e){
        boolean flag = true;
        int sbp = e.getSbp();
        int dbp = e.getDbp();
        
        //JOptionPane.showMessageDialog(this, sbp);
        if (age<=18){
            
            if ((sbp<80 || dbp<55) || (sbp>120 || dbp>81)){
                flag = false;
            
        }
            
        }
        else if(age<=40 && age>18)
        {
            if ((sbp<108 || dbp<75) || (sbp>135 || dbp>88)){
                flag = false;
            
        }
            
        }
        else{
            if ((sbp<112 || dbp<79) || (sbp>147 || dbp>91)){
                flag = false;
            
        }
            
        }
          
        return flag; 
    }
    
    
    
    public void populateCasesTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);

        for (String i : comHashMap.keySet()){
            
        Object[] row = new Object[2];
        row[0] = i;
        row[1] = comHashMap.get(i);
        dtm.addRow(row);
        }
        
        
    }
     public void populatePatientsTable(){
        DefaultTableModel dtm = (DefaultTableModel) jTable2.getModel();
        dtm.setRowCount(0);
        
        
        
        
        for(Patient patient:patientDirectory.getPatientList()){
            
            if (patient.getEncounterHistory().getEncounterList().size()>0){
               
            if (!ifAbnormal(patient.getAge(), patient.getEncounterHistory().getEncounterList().get(patient.getEncounterHistory().getEncounterList().size() - 1)))
             {
                Object[] row = new Object[5];
                row[0] = patient.getName();
                row[1] = patient.getAge();
                row[2] = patient.getCommunity();
                row[3] = patient.getEncounterHistory().getEncounterList().get(patient.getEncounterHistory().getEncounterList().size() - 1).getSbp();
                row[4] = patient.getEncounterHistory().getEncounterList().get(patient.getEncounterHistory().getEncounterList().size() - 1).getDbp();

                dtm.addRow(row);
                updateHash(patient.getCommunity());
             }
                
            }

             
             populateCasesTable();
             
        
              
              

            
        }
    }
     
     public void updateHash(String c){
         
         int count = 0;
         
         if (comHashMap.containsKey(c)){
             count  = comHashMap.get(c);
             count = count+1;
             comHashMap.remove(c);
             comHashMap.put(c, count);
             
         }
         else{
             comHashMap.put(c, 1);
         }
         
     }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Patients with abnormal BP");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("The number of abnormal BP per community");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Community", "Number of Abnormal Cases"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Community", "SBP", "DBP", "Title 6"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}