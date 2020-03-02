<?php ob_start();
	include 'incl/header.php'; ?>
<?php include 'string/string.php';
	  include 'connect/conn.php';

	  				$tenLT = "";
	  				$tenTL = "";
	  				$tenTLSlug ="";
					
				if ($_SERVER['REQUEST_METHOD'] == 'POST') {
					
					if (!empty($_POST['tenLT']) && !empty($_POST['tenTL'])) {
							$tenLT = $_POST['tenLT'];
							$tenLTSlug = convert_vi_to_en($_POST['tenLT']);
							$tenTL = $_POST['tenTL'];
							
							$sql ="INSERT INTO `loaitin`( `Ten`, `TenKhongDau`,`idTheLoai`) VALUES ('$tenLT','$tenLTSlug','$tenTL')";
								$result = mysqli_query($conn,$sql);
									if ($result) {
										$success = '<p class="alert alert-success col-4"> Thêm thành công <a href="listLoaiTin.php">Tới trang danh sách</a></p>';
									}else {
									$waring = '<p class="alert alert-success col-4"> Thêm thất bại</p>';
										  }
						}else {
							
							$message = '<p class="alert alert-danger col-4">Vui lòng điền thông tin đầy đủ</p>';
						}
							
				}

 ?>
<div class="form">
	<h2>Thêm loại tin: </h2>
	<form action="" method="post">
		<?php if (isset($message)) {
				echo $message;
			}
			if (isset($success)) {
					echo $success;
				}elseif (isset($waring)) {
					echo $waring;

				}	
			 ?>
		<div class="form-group col-4">
			<label for="">Tên loại tin:</label>
			<input class="form-control" type="text" name="tenLT" placeholder="Tên loại tin">
		</div>
		<div class="form-group col-4">
			<label for="">Thuộc thể loại:</label>
			<select name="tenTL" class="form-control">
				<option value="" selected>Choose...</option>
				<?php
					 $sql = "SELECT * FROM `theloai`";
	  				 $result = mysqli_query($conn,$sql);
					 if (mysqli_num_rows($result)>0) {
						while ($row = mysqli_fetch_assoc($result)) {
				?>
				<option value="<?php echo$row['id'] ?>"><?php echo $row['Ten']; ?></option>
				<?php
					}
				} ?>
			
			</select>
		</div>
		<div class="form-group">
			<input class="btn btn-dark" type="submit" name="submit" value="Thêm">
		</div>
	</form>
</div>
<?php include 'incl/footer.php'; ob_flush();?>