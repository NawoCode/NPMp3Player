
package np.pk;

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author acer
 */
public class FileTypeFilter extends FileFilter{
    
    private final String extension;
    private final String description;
    
    //constructer method
    public FileTypeFilter(String extension, String description){
    
    this.extension = extension;
    this.description =description;
    }
    
    @Override
    public boolean accept(File file){
        //if file is returning directory
        if(file.isDirectory()){
            return true;
        }
        //return file name with extension
        return file.getName().endsWith(extension);
        
    }
    
    @Override
    public String getDescription(){
        //return to display filetype and description
        return description + String.format("(*%s)", extension);
    }
    
}
